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
    private var urlimg = "https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg?auto=compress&cs=tinysrgb&w=1200"
    @State var selected = "Archery"
    @State private var id = 1
    @State private var showAlert = false
    var colors: [Color] = [.blue, .cyan, .green, .gray, .mint, .orange, .indigo, .purple]
    var body: some View {
        NavigationView {
           ScrollView(.vertical) {
               VStack {
                   Text("Sport is a form of physical activity or game. Often competitive and organized, sports use, maintain, or improve physical ability and skills. They also provide enjoyment to participants and, in some cases, entertainment to spectators").lineLimit(6).padding(.bottom, 20)
                   Text("padded text")
                   NavigationLink("Archery", destination: archeryPage)
                   NavigationLink("Bowling", destination: BowlingPage)
                   .alert("Sports", isPresented: $showAlert) {
                   } message: {
                       Text("Hello Sports")
                   }
                   
                   Button("Start Archery") {
                       showAlert.toggle()
                   }
                   
                   /*Text("Hello world")
                       .padding().foregroundStyle(.white).font(.largeTitle)
                       .background(LinearGradient(gradient: Gradient(colors: [.blue, .white]), startPoint: .top, endPoint: .bottomTrailing))
                   // ios 15
                   AsyncImage(url: URL(string: urlimg)) {image in image.image?.resizable()}.frame(width: 250, height: 300).clipShape(.rect(cornerRadius: 25))*/
                   
               }
               }
               // Image("dog") // xCode ver 14 or earlier
           }
           .navigationTitle(" Sports")
           .navigationBarTitleDisplayMode(.automatic)
           .navigationBarHidden(false)
           .navigationBarItems(leading: EditButton(), trailing: Image(systemName: "person.fill"))
        }
        
        
        
        /*Text("Why not try...").font(.largeTitle.bold())
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
           
        }.buttonStyle(.borderedProminent)*/
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
    }.navigationTitle(" Bowling").padding()
}
