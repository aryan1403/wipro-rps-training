//
//  ImageView.swift
//  demoswift
//
//  Created by Aaryan Kumar on 07/06/24.
//

import SwiftUI

struct ImageView: View {
    @ObservedObject private var imageViewModel: ImageViewModel
    
    init(urlString: String?) {
        imageViewModel = ImageViewModel(urlString: urlString)
    }
    
    var body: some View {
        Image(uiImage: imageViewModel.image ?? UIImage()).resizable()
    }
}
