clear
echo "Counting unique words"
echo
cat $1 | tr " " "\n" | sort | uniq | wc -l

echo "Prompt"
echo
