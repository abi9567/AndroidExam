package com.example.androidexam.data

data class FruitCategory(
    val index : Int,
    val imageUrl : String?,
    val name : String?,
    var fruitList : List<Fruit?>?
) {
    companion object {
        val fruitList = listOf(
            FruitCategory(name = "Citrus Fruits",
                imageUrl = "https://cdn.firstcry.com/education/2022/11/29120033/Citrus-Fruits-Names-for-Preschoolers-and-Kids.jpg",
                index = 0, fruitList = listOf(
                Fruit(name = "Lemon", image = null, description = "A sour, yellow citrus fruit used in cooking and beverages."),
                Fruit(name = "Orange", image = null, description = "A sweet, orange-colored citrus fruit."),
                Fruit(name = "Lime", image = null, description = "A small, green citrus fruit often used in cooking and cocktails."),
                Fruit(name = "Grapefruit", image = null, description = "A large, tart citrus fruit with a slightly bitter taste."),
                Fruit(name = "Tangerine", image = null, description = "A small, sweet citrus fruit similar to an orange."),
                Fruit(name = "Mandarin", image = null, description = "A small, sweet citrus fruit, often eaten as a snack."),
                Fruit(name = "Pomelo", image = null, description = "The largest citrus fruit, with a thick rind and sweet-tart taste."),
                Fruit(name = "Clementine", image = null, description = "A seedless variety of mandarin orange."),
                Fruit(name = "Bitter Orange", image = null, description = "Used mainly for marmalade and in flavoring liqueurs."),
                Fruit(name = "Bergamot Orange", image = null, description = "A fragrant citrus fruit used in perfumes and to flavor Earl Grey tea."),
                Fruit(name = "Citron", image = null, description = "A large, fragrant citrus fruit with a thick rind."),
                Fruit(name = "Calamondin", image = null, description = "A small, sour citrus fruit often used in Asian cuisine."),
                Fruit(name = "Yuzu", image = null, description = "A Japanese citrus fruit used in cooking and sauces."),
                Fruit(name = "Kaffir Lime", image = null, description = "A citrus fruit with a bumpy rind, used in Southeast Asian cuisine."),
                Fruit(name = "Sudachi", image = null, description = "A small, green citrus fruit from Japan, similar to yuzu."),
                Fruit(name = "Etrog", image = null, description = "A citron used in Jewish religious rituals during Sukkot."),
                Fruit(name = "Seville Orange", image = null, description = "A bitter orange used in the production of marmalade."),
                Fruit(name = "Kabosu", image = null, description = "A Japanese citrus fruit used for flavoring."),
                Fruit(name = "Ugli Fruit", image = null, description = "A Jamaican tangelo with a unique appearance."),
                Fruit(name = "Finger Lime", image = null, description = "A small, elongated lime with caviar-like vesicles inside."),
                Fruit(name = "Kumquat", image = null, description = "A small, sweet, and sour citrus fruit eaten whole, including the peel."),
                Fruit(name = "Meyer Lemon", image = null, description = "A cross between a lemon and an orange, with a sweeter flavor."),
                Fruit(name = "Sweet Lemon", image = null, description = "A less acidic variety of lemon, popular in the Middle East."),
                Fruit(name = "Desert Lime", image = null, description = "A citrus fruit native to Australia, used in bush food."),
                Fruit(name = "Navel Orange", image = null, description = "A sweet, seedless orange with a characteristic 'navel' at the blossom end."),
                Fruit(name = "Valencia Orange", image = null, description = "A sweet orange variety, commonly used for juice."),
                Fruit(name = "Blood Orange", image = null, description = "An orange with red flesh, known for its rich, berry-like flavor."),
                Fruit(name = "Key Lime", image = null, description = "A small lime, often used in pies and cocktails."),
                Fruit(name = "Ponderosa Lemon", image = null, description = "A large, thick-skinned lemon hybrid with a bumpy surface."),
                Fruit(name = "Shonan Gold", image = null, description = "A sweet, hybrid citrus fruit developed in Japan.")
            )),

            FruitCategory(name = "Berries",
                imageUrl = "https://media.istockphoto.com/id/499658564/photo/wild-berry-mix-strawberries-blueberries-blackberries-and-raspberries.jpg?s=612x612&w=0&k=20&c=H-hRK6piHD2TyIFZ2sezzduHJ2xYpKyoTil4776sklA=",
                index = 1, fruitList = listOf(
                Fruit(name = "Strawberry", image = null, description = "A sweet, red fruit often used in desserts and smoothies."),
                Fruit(name = "Blueberry", image = null, description = "A small, round, blue fruit rich in antioxidants."),
                Fruit(name = "Raspberry", image = null, description = "A red or black berry with a tart flavor, commonly used in desserts."),
                Fruit(name = "Blackberry", image = null, description = "A dark purple berry with a sweet-tart flavor."),
                Fruit(name = "Goji Berry", image = null, description = "A small, red berry often used in traditional medicine."),
                Fruit(name = "Cranberry", image = null, description = "A tart, red berry commonly used in sauces and juices."),
                Fruit(name = "Boysenberry", image = null, description = "A hybrid berry with a sweet-tart flavor, used in jams and desserts."),
                Fruit(name = "Huckleberry", image = null, description = "A small, dark berry with a tart flavor."),
                Fruit(name = "Elderberry", image = null, description = "A dark purple berry often used in syrups and wine."),
                Fruit(name = "Mulberry", image = null, description = "A sweet, dark berry often used in pies and jams."),
                Fruit(name = "Acai Berry", image = null, description = "A small, dark purple berry rich in antioxidants."),
                Fruit(name = "Loganberry", image = null, description = "A hybrid berry with a tart flavor, similar to a raspberry."),
                Fruit(name = "Marionberry", image = null, description = "A type of blackberry with a complex, sweet-tart flavor."),
                Fruit(name = "Bilberry", image = null, description = "A small, dark berry similar to a blueberry, known for its health benefits."),
                Fruit(name = "Chokeberry", image = null, description = "A tart, dark berry often used in juices and jams."),
                Fruit(name = "Cloudberry", image = null, description = "A golden-yellow berry with a tart flavor, often used in desserts."),
                Fruit(name = "Salmonberry", image = null, description = "A bright orange berry with a sweet, mild flavor."),
                Fruit(name = "Tayberry", image = null, description = "A hybrid berry with a sweet, tangy flavor, similar to a raspberry."),
                Fruit(name = "Lingonberry", image = null, description = "A small, red berry with a tart flavor, popular in Scandinavian cuisine."),
                Fruit(name = "Serviceberry", image = null, description = "A small, sweet berry often used in pies and jams."),
                Fruit(name = "Wineberry", image = null, description = "A small, red berry with a sweet-tart flavor, often used in desserts."),
                Fruit(name = "Thimbleberry", image = null, description = "A red berry with a sweet, mild flavor, similar to a raspberry."),
                Fruit(name = "Juneberry", image = null, description = "A small, dark berry with a sweet flavor, often used in jams."),
                Fruit(name = "Buffaloberry", image = null, description = "A small, red berry with a tart flavor, often used in syrups."),
                Fruit(name = "Sea Buckthorn", image = null, description = "A small, orange berry rich in vitamin C, often used in juices."),
                Fruit(name = "Oregon Grape", image = null, description = "A small, dark berry with a tart flavor, often used in jams."),
                Fruit(name = "Wintergreen Berry", image = null, description = "A small, red berry with a minty flavor, often used in candies."),
                Fruit(name = "Barberry", image = null, description = "A small, red berry with a tart flavor, often used in Middle Eastern cuisine."),
                Fruit(name = "Rowanberry", image = null, description = "A small, red-orange berry with a tart flavor, often used in jellies."),
                Fruit(name = "Bearberry", image = null, description = "A small, red berry with a mild flavor, often used in traditional medicine.")
            )),

            FruitCategory(name = "Stone Fruits",
                imageUrl = "https://cdn.sanity.io/images/bow86i8j/production/525094835cc33324c1ec39705b74c28db0b0f449-1800x920.jpg?fit=crop&h=630&q=75&w=1200",
                index = 2, fruitList = listOf(
                Fruit(name = "Peach", image = null, description = "A sweet, juicy fruit with fuzzy skin and a large pit."),
                Fruit(name = "Nectarine", image = null, description = "A smooth-skinned fruit similar to a peach."),
                Fruit(name = "Plum", image = null, description = "A sweet, juicy fruit with smooth skin and a large pit."),
                Fruit(name = "Cherry", image = null, description = "A small, round fruit with a sweet or tart flavor."),
                Fruit(name = "Apricot", image = null, description = "A small, orange fruit with a sweet, tangy flavor."),
                Fruit(name = "Mango", image = null, description = "A sweet, tropical fruit with a large pit."),
                Fruit(name = "Lychee", image = null, description = "A small, tropical fruit with sweet, juicy flesh."),
                Fruit(name = "Durian", image = null, description = "A large, spiky fruit known for its strong smell and creamy texture."),
                Fruit(name = "Rambutan", image = null, description = "A small, hairy fruit with sweet, juicy flesh."),
                Fruit(name = "Longan", image = null, description = "A small, round fruit with a sweet, juicy flavor."),
                Fruit(name = "Loquat", image = null, description = "A small, orange fruit with a sweet-tart flavor."),
                Fruit(name = "Olive", image = null, description = "A small, bitter fruit often used to make olive oil."),
                Fruit(name = "Date", image = null, description = "A sweet, chewy fruit often eaten dried."),
                Fruit(name = "Almond", image = null, description = "A nut-like fruit with a hard shell and sweet, edible seed."),
                Fruit(name = "Coconut", image = null, description = "A large, tropical fruit with a hard shell and sweet, white flesh."),
                Fruit(name = "Avocado", image = null, description = "A creamy, green fruit with a large pit."),
                Fruit(name = "Black Cherry", image = null, description = "A small, dark fruit with a sweet flavor."),
                Fruit(name = "Green Almond", image = null, description = "A young, tender almond with a tart flavor."),
                Fruit(name = "Japanese Plum", image = null, description = "A small, sweet fruit with smooth skin."),
                Fruit(name = "Mirabelle Plum", image = null, description = "A small, sweet, yellow plum."),
                Fruit(name = "Sour Cherry", image = null, description = "A small, tart fruit often used in pies."),
                Fruit(name = "Rainier Cherry", image = null, description = "A sweet, golden-yellow cherry with a red blush."),
                Fruit(name = "Damson Plum", image = null, description = "A small, tart plum often used in jams."),
                Fruit(name = "Santa Rosa Plum", image = null, description = "A sweet-tart plum with red skin and yellow flesh."),
                Fruit(name = "Blood Plum", image = null, description = "A plum with dark red flesh and a sweet-tart flavor."),
                Fruit(name = "White Peach", image = null, description = "A sweet peach with pale, white flesh."),
                Fruit(name = "Yellow Nectarine", image = null, description = "A sweet nectarine with bright yellow flesh."),
                Fruit(name = "Satsuma Plum", image = null, description = "A sweet plum with red flesh and dark purple skin."),
                Fruit(name = "Muscadine", image = null, description = "A large, thick-skinned grape with a sweet, musky flavor."),
                Fruit(name = "Persimmon", image = null, description = "A sweet, orange fruit with a soft, jelly-like texture when ripe.")
            )),

            FruitCategory(name = "Tropical Fruits",
                imageUrl = "https://www.tastingtable.com/img/gallery/14-fruits-uncommon-in-the-u-s-you-need-to-try-once/intro-1679850799.jpg",
                index = 3, fruitList = listOf(
                Fruit(name = "Banana", image = null, description = "A long, curved fruit with soft, sweet flesh."),
                Fruit(name = "Pineapple", image = null, description = "A tropical fruit with spiky skin and sweet, tangy flesh."),
                Fruit(name = "Mango", image = null, description = "A sweet, juicy fruit with a large pit."),
                Fruit(name = "Papaya", image = null, description = "A large, tropical fruit with sweet, orange flesh."),
                Fruit(name = "Passion Fruit", image = null, description = "A small, round fruit with a sweet-tart flavor and crunchy seeds."),
                Fruit(name = "Guava", image = null, description = "A tropical fruit with sweet, juicy flesh and a strong aroma."),
                Fruit(name = "Coconut", image = null, description = "A large, tropical fruit with a hard shell and sweet, white flesh."),
                Fruit(name = "Durian", image = null, description = "A large, spiky fruit known for its strong smell and creamy texture."),
                Fruit(name = "Jackfruit", image = null, description = "A large, tropical fruit with sweet, fibrous flesh."),
                Fruit(name = "Lychee", image = null, description = "A small, round fruit with sweet, juicy flesh."),
                Fruit(name = "Rambutan", image = null, description = "A small, hairy fruit with sweet, juicy flesh."),
                Fruit(name = "Dragon Fruit", image = null, description = "A tropical fruit with vibrant skin and mildly sweet flesh."),
                Fruit(name = "Starfruit", image = null, description = "A star-shaped tropical fruit with a sweet-tart flavor."),
                Fruit(name = "Mangosteen", image = null, description = "A tropical fruit with a sweet, tangy flavor and thick, purple rind."),
                Fruit(name = "Cherimoya", image = null, description = "A tropical fruit with creamy, custard-like flesh."),
                Fruit(name = "Soursop", image = null, description = "A large, tropical fruit with sweet-tart, creamy flesh."),
                Fruit(name = "Tamarind", image = null, description = "A tropical fruit with a tangy, sweet-sour flavor."),
                Fruit(name = "Sapodilla", image = null, description = "A small, brown fruit with sweet, caramel-like flesh."),
                Fruit(name = "Longan", image = null, description = "A small, round fruit with sweet, juicy flesh."),
                Fruit(name = "Cupuacu", image = null, description = "A large, tropical fruit with a creamy, chocolate-like flavor."),
                Fruit(name = "Feijoa", image = null, description = "A small, green fruit with sweet, aromatic flesh."),
                Fruit(name = "Breadfruit", image = null, description = "A large, tropical fruit with starchy, bread-like flesh."),
                Fruit(name = "Ackee", image = null, description = "A tropical fruit with soft, creamy flesh, often cooked in savory dishes."),
                Fruit(name = "Sugar Apple", image = null, description = "A small, tropical fruit with sweet, creamy flesh."),
                Fruit(name = "Golden Apple", image = null, description = "A small, tropical fruit with sweet-tart flavor."),
                Fruit(name = "Abiu", image = null, description = "A tropical fruit with sweet, custard-like flesh."),
                Fruit(name = "Caimito", image = null, description = "A tropical fruit with sweet, star-shaped flesh."),
                Fruit(name = "Cocona", image = null, description = "A small, tropical fruit with a tangy, tomato-like flavor."),
                Fruit(name = "Mamey Sapote", image = null, description = "A large, tropical fruit with sweet, orange flesh."),
                Fruit(name = "Langsat", image = null, description = "A small, tropical fruit with sweet, translucent flesh.")
            )),

            FruitCategory(name = "Melons",
                imageUrl = "https://nutrivore.com/wp-content/uploads/2022/12/Melons-1024x683.jpg",
                index = 4, fruitList = listOf(
                Fruit(name = "Watermelon", image = null, description = "A large, green-skinned fruit with sweet, juicy red flesh."),
                Fruit(name = "Cantaloupe", image = null, description = "A round melon with orange flesh and a sweet, musky flavor."),
                Fruit(name = "Honeydew", image = null, description = "A sweet, green-fleshed melon with a smooth rind."),
                Fruit(name = "Galia Melon", image = null, description = "A hybrid melon with sweet, green flesh."),
                Fruit(name = "Santa Claus Melon", image = null, description = "A large melon with a green rind and sweet, white flesh."),
                Fruit(name = "Canary Melon", image = null, description = "A bright yellow melon with sweet, juicy flesh."),
                Fruit(name = "Crenshaw Melon", image = null, description = "A sweet melon with a smooth, yellow rind and salmon-colored flesh."),
                Fruit(name = "Casaba Melon", image = null, description = "A large melon with a wrinkled rind and mild, sweet flesh."),
                Fruit(name = "Bitter Melon", image = null, description = "A small, bumpy melon with a bitter taste."),
                Fruit(name = "Korean Melon", image = null, description = "A small, yellow melon with sweet, crisp flesh."),
                Fruit(name = "Charentais Melon", image = null, description = "A small, fragrant melon with sweet, orange flesh."),
                Fruit(name = "Sprite Melon", image = null, description = "A small, sweet melon with crisp, white flesh."),
                Fruit(name = "Hami Melon", image = null, description = "A large, sweet melon with a crisp texture."),
                Fruit(name = "Sugar Kiss Melon", image = null, description = "A small, very sweet melon with tender flesh."),
                Fruit(name = "Horned Melon", image = null, description = "A spiky, orange melon with a tart, jelly-like green interior."),
                Fruit(name = "Sharlyn Melon", image = null, description = "A melon with a netted rind and sweet, aromatic flesh."),
                Fruit(name = "Piel de Sapo", image = null, description = "A large, green-skinned melon with sweet, white flesh."),
                Fruit(name = "Golden Langkawi Melon", image = null, description = "A small, sweet melon with golden skin and tender flesh."),
                Fruit(name = "Snow Leopard Melon", image = null, description = "Melon"))))
    }
}

data class Fruit(
    val name : String?,
    val image : String?,
    val description : String?
)
