package com.infinite.pdfbox;

	import org.apache.pdfbox.pdmodel.PDDocument;
	import org.apache.pdfbox.pdmodel.PDPage;

	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.Writer;
	import java.io.FileOutputStream;

	import com.itextpdf.text.Document;
	import com.itextpdf.text.DocumentException;
	import com.itextpdf.text.Paragraph;
	import com.itextpdf.text.pdf.PdfWriter;
	public class PdfBox {
		public static void main (String args[]){
			
			Document pdfdoc=new Document();
			
			try{
				PdfWriter writer =PdfWriter.getInstance(pdfdoc,new FileOutputStream("D:\\createfile.pdf"));
				System.out.println("Pdf created");
				pdfdoc.open();
				pdfdoc.add(new Paragraph("Infinite Computer Solutions "));
				pdfdoc.add(new Paragraph("Learning my way"));
				pdfdoc.add(new Paragraph("A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z"));
				pdfdoc.addCreationDate();
				pdfdoc.close();
				writer.close();
			}
			catch (DocumentException e){
				e.printStackTrace();
			}
			catch (FileNotFoundException e){
				e.printStackTrace();
			}

		}
	}

