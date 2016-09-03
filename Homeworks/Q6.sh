clear
for file in *; do
  file_name="${file%.*}"
  mkdir -p "$file_name"
  mv "$file" "$file_name"
done

echo "Created directory for each file"