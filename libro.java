public class libro {
  /*atributos*/
  private int ISBN;
  private String titulo;
  private String autor;
  private int paginas;

  /*constructor*/
  public libro(int pISBN, String ptitulo, String pautor, int ppaginas){
    ISBN = pISBN;
    titulo = ptitulo;
    autor = pautor;
    paginas = ppaginas;
  }

  /*getters and setters*/
  public int getISBN(){
    return ISBN;
  }
  public void setISBN(int ISBN){
    this.ISBN = ISBN;
  }
  public String getTitulo(){
    return titulo;
  }
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }
  public String getAutor(){
    return autor;
  }
  public void setAutor(String autor){
    this.autor = autor;
  }
  public int getPaginas(){
    return paginas;
  }
  public void setPaginas(int paginas){
    this.paginas = paginas;
  }

  /*Metodo toString*/
  @Override
  public String toString(){
    return "El libro "+titulo+" con ISBN "+ISBN+" creado por el autor "+autor+" tiene "+paginas+" páginas.";
  }


}