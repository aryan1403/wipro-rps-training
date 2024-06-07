//
//  ContentView.swift
//  demoswift
//
//  Created by Aaryan Kumar on 06/06/24.
//

import SwiftUI
import UIKit

struct ContentView: View {
    var activities = ["Archery", "BasketBall", "Baseball"]
    @State var selected = "Archery"
    @State private var id = 1
    var colors: [Color] = [.blue, .cyan, .green, .gray, .mint, .orange, .indigo, .purple]
    var body: some View {
        NavigationView {
               ScrollView(.vertical) {
                   NavigationLink("Archery", destination: archeryPage)
                   NavigationLink("Bowling", destination: BowlingPage)
               }
               .navigationTitle(" Sports")
               .navigationBarTitleDisplayMode(.automatic)
               .navigationBarHidden(false)
               .navigationBarItems(leading: EditButton(), trailing: Image(systemName: "person.fill"))
               }
        Text("Why not try...").font(.largeTitle.bold())
        Spacer()
        VStack {
            Circle().fill(colors.randomElement() ?? .blue).padding()
                .overlay(Image(systemName: "figure.\(selected)".lowercased())
                    .font(.system(size: 144))
                    .foregroundColor(.white))
            Text("\(selected)").font(/*@START_MENU_TOKEN@*/.title/*@END_MENU_TOKEN@*/)
        }.transition(.slide).id(id)
        Spacer()
        Button("Change Activity") {
            // change
            withAnimation(.easeInOut(duration: 1)) {
                selected = activities.randomElement() ?? "Bowling"
                id += 1
            }
           
        }.buttonStyle(.borderedProminent)
    }
}

#Preview {
    ContentView()
}

var archeryPage: some View {
    let url = "https://media.istockphoto.com/id/480151575/photo/bulls-eye.jpg?s=612x612&w=0&k=20&c=MAzMeUolh8MgQDah2-X6rl6ZGFUgRtuk6JbIT9kUJBI="
    
    // let url2 = "https://i.ytimg.com/vi/IWMezRqHu10/hqdefault.jpg"
    
    return VStack {
        // Image("archery").resizable().scaledToFit()
        // click on this image --> url
        ImageView(urlString: url).frame(width: 600, height: 350)
        Text("my archery image")
        
    }.navigationTitle(" Archery").padding()
}



var BowlingPage: some View {
    let url = "https://img.freepik.com/free-vector/bowling-strike-poster-sport-scene_603843-1421.jpg"
    
    // let url2 = "https://i.ytimg.com/vi/IWMezRqHu10/hqdefault.jpg"
    
    return VStack {
        // Image("archery").resizable().scaledToFit()
        // click on this image --> url
        ImageView(urlString: url).frame(width: 600, height: 350)
        Text("Bowling Image")
        
    }.navigationTitle(" Bowling").padding()
}
