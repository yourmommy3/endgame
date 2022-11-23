<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
 <html><body>
  <h2 style="color:green;" align="center">Books</h2><table border="1" align="center">
   <tr style="color:grey;">
<th>Title</th><th>Author</th><th>ISBN</th>
 <th>Publisher</th> <th>Edition</th> <th>Price</th></tr>
<xsl:for-each select="bookdetails/book"><tr>
      <td style="font-family:'Comic Sans MS'; color:red;"><xsl:value-of select="title"/></td>
  <td style="text-transform: capitalize; font-weight:bold;" align="center"><xsl:value-of select="author"/></td>
      <td style="color:blue"><xsl:value-of select="isbn"/></td>
<td style="color:green; font-weight:bold;" align="center"><xsl:value-of select="publisher"/></td>
<td style="pink"  align="center"><xsl:value-of select="edition"/></td>
<td style="color:violet; font-weight:bold;"><xsl:value-of select="price"/></td> </tr>
</xsl:for-each>
  </table> </body> </html>
</xsl:template>
</xsl:stylesheet>
