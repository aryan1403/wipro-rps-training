//
//  PaymentView.swift
//  demoswift
//
//  Created by Aaryan Kumar on 07/06/24.
//

import SwiftUI
struct Subscriptions: Identifiable {
    var id: String;
    var price: Double;
    var duration: Date;
    var name: String;
    var isSubscribed: Bool;
}

struct PaymentView: View {
    @State var list = [
        Subscriptions(id: "1", price: 30, duration: Date.now, name: "BGMI Royal Pass", isSubscribed: true),
        Subscriptions(id: "2", price: 46, duration: Date.now, name: "Netflix", isSubscribed: true),
        Subscriptions(id: "3", price: 10, duration: Date.now, name: "Spotify", isSubscribed:true)
    ]
    var body: some View {
        Form {
            Section {
                List {
                    ForEach($list) { $list in
                        Text(list.name)
                            
                    }.onDelete(perform: deleteSubs)
                }
                
            }
            
            Section {
                Toggle("Subscribe to all", sources: $list, isOn: \.isSubscribed)
            }
        }
    }
    
    
    func deleteSubs(at offsets: IndexSet) {
        list.remove(atOffsets: offsets)
    }
}

#Preview {
    PaymentView()
}
