infile = "C:/Users/Derek/Documents/development/tweets-generator/data/alice-in-wonderland.txt"
outfile = "C:/Users/Derek/Documents/development/tweets-generator/data/alice-in-wonderland-snippets.txt"

text = new File(infile).text

out = new File(outfile)
out.delete()

chunk = 130
i = 0
length = text.size()
while (i < length) {
  end = i+chunk >= length ? length-1 : i+chunk
  l = text[i..end]
  out << "..." + l + "...\n"
  i += chunk + 1
}

println("done: " + outfile)