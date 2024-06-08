//
//  HomeView.swift
//  demoswift
//
//  Created by Aaryan Kumar on 07/06/24.
//

import SwiftUI

struct HomeView: View {
    @State private var showLabel = false
    @State private var email: String = ""
    @State private var bDate = Date.now
    @State private var celcius: Double = 0
    @State private var downloadedAmt: Double = 0
    
    // Thread
    let timer = Timer.publish(every: 0.1, on: .main, in: .common).autoconnect()
    var body: some View {
        VStack {
            /*Button("Show Label") {
                showLabel.toggle()
            }
            if showLabel {Text("Home View")}*/
            /*TextField("Enter your name", text: $email, axis: .vertical)
                .textFieldStyle(.roundedBorder) .padding()
            Text("Hello \(email)")*/
            
            /*DatePicker(selection: $bDate, in: ...Date.now, displayedComponents: .date) {
                Text("Select a date")
            }
            Text("Date is \(bDate.formatted(date: .long, time: .omitted))")*/
            /*Toggle("Read Swift", isOn: $showLabel).toggleStyle(.button).tint(.mint)
            
            if showLabel {
                Text("Task Completed")
            }*/
            
            /*Slider(value: $celcius, in: -100...100)
            Text("\(celcius, specifier: "%.1f") Celcius is \(celcius * 9/5 + 32, specifier: "%.1f") Farenheit")
            Link(destination: URL(string: "https://github.com/aryan1403")!) {
                Image(systemName: "link.circle.fill").font(.title)
            }*/
            
            ProgressView("Downloading...", value: downloadedAmt, total: 100)
                .onReceive(timer) {_ in
                    if downloadedAmt < 100 {
                        downloadedAmt += 2
                    }
                }
        }
    }
}

#Preview {
    HomeView()
}
