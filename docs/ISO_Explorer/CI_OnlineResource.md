---
title: CI OnlineResource
permalink: /CI_OnlineResource/
---

<h1> CI OnlineResource </h1>

<table class="wikitable">
<tbody>
<tr>
<th colspan="3">
Elements

</th>
<th>
<i>Definition and Recommended Practice</i>

</th>
</tr>

<tr>
<td bgcolor="FFFF99">
1

</td>
<td bgcolor="FFFF99">
[linkage](/URL)

</td>
<td bgcolor="FFFF99">
1

</td>

<td>
Internet address which uses a Uniform Resource Locator address or similar addressing scheme. Provide complete address to active URL. Do not provide URLs in other elements.
***Example***: [`https://www.noaa.gov`](https://www.noaa.gov)
</td>
</tr>

<tr>
<td bgcolor="CCFFFF">
2

</td>
<td bgcolor="CCFFFF">
\[protocol](/CharacterString)

</td>
<td bgcolor="CCFFFF">
0..1

</td>
<td>
The connection protocol to be used. When applicable, use the identifier values in this [codelist](https://github.com/OSGeo/Cat-Interop/blob/master/LinkPropertyLookupTable.csv) hosted by Open Source Geospatial Foundation.
</td>
</tr>
<tr>
<td bgcolor="CCFFFF">
3

</td>
<td bgcolor="CCFFFF">
**Application Profile** [applicationProfile](/CharacterString)

</td>
<td bgcolor="CCFFFF">
0..1

</td>
<td>Name of an application profile that can be used with the online resource</td>

</tr>
<tr>
<td bgcolor="CCFFFF">
4

</td>
<td bgcolor="CCFFFF">
[name](/CharacterString)

</td>
<td bgcolor="CCFFFF">
0..1

</td>
<td>Title of the online resource. For HTML pages, use the html title tag. Recommend providing at least a name or a description.</td>
</tr>
<tr>
<td bgcolor="CCFFFF">
5

</td>
<td bgcolor="CCFFFF">
[description](/CharacterString "wikilink")

</td>
<td bgcolor="CCFFFF">
0..1

</td>
<td>
Brief text explaining content or purpose of online resource. Recommend providing at least a name or a description.
**Example:** `NOAA homepage` 
</td>
</tr>
<tr>
<td bgcolor="CCFFFF">
6

</td>
<td bgcolor="CCFFFF">
[function](/ISO_19115_and_19115-2_CodeList_Dictionaries#CI_OnLineFunctionCode "wikilink")

</td>
<td bgcolor="CCFFFF">
0..1

</td>
<td>
Categorize the purpose of this online resource. Use 'download' for direct access to files or ftp sites. Use 'information' for pages with only descriptive information about the resource. Use 'search' for interfaces that support users interaction to find the resource of interest. 
</td>
</tr>
</tbody>
</table>
### Community Requirements

*M = Mandatory; C = Conditional; R = Recommended; blank cell = user discretion*

<table class="wikitable" border="1">
<tbody>
<tr>
<th>
Community

</th>
<th>
Element

</th>
<th>
M/C/R

</th>
<th>
Notes

</th>
</tr>
<tr bgcolor="FFFFFF" border="2">
<td rowspan="6">
NOAA Completeness Rubric V2

</td>
<td>
linkage

</td>
<td align="center">
M

</td>
<td>
</td>
</tr>
<tr bgcolor="FFFFFF">
<td>
protocol

</td>
<td align="center">
C

</td>
<td>
Required when the URL is for Data Access

</td>
</tr>
<tr bgcolor="FFFFFF">
<td>
applicationProfile

</td>
<td align="center">
</td>
<td>
</td>
</tr>
<tr bgcolor="FFFFFF">
<td>
name

</td>
<td align="center">
C

</td>
<td>
Provide if description field is null.

</td>
</tr>
<tr bgcolor="FFFFFF">
<td>
description

</td>
<td align="center">
C

</td>
<td>
Provide if name field is null.

</td>
</tr>
<tr bgcolor="FFFFFF">
<td>
function

</td>
<td align="center">
M

</td>
<td>
</td>
</tr>
<tr>
<th colspan="6">
</th>
</tr>
<tr bgcolor="FFFFFF" border="2">
<td rowspan="6">
OneStop Project

</td>
<td>
linkage

</td>
<td align="center">
M

</td>
<td>
</td>
</tr>
<tr bgcolor="FFFFFF">
<td>
protocol

</td>
<td align="center">
C

</td>
<td>
Required when the URL is for Data Access

</td>
</tr>
<tr bgcolor="FFFFFF">
<td>
applicationProfile

</td>
<td align="center">
</td>
<td>
</td>
</tr>
<tr bgcolor="FFFFFF">
<td>
name

</td>
<td align="center">
C

</td>
<td>
Provide if description field is null.

</td>
</tr>
<tr bgcolor="FFFFFF">
<td>
description

</td>
<td align="center">
C

</td>
<td>
Provide if name field is null.

</td>
</tr>
<tr bgcolor="FFFFFF">
<td>
function

</td>
<td align="center">
M

</td>
<td>
</td>
</tr>
</tbody>

</table>
### More Information
UML Image: [CI OnlineResource.png](/CI_OnlineResource.png)
<table class="wikitable">
<tbody>
<tr>
<td colspan="3" bgcolor="FFFFFF">
Links
</td>
<td>
[Online Resources](/Online_Resources)
</td>
</tr>
<tr>
</tr>
</tbody>
</table>

## XML Examples 

>    \<gmd:CI_OnlineResource> <br />
>       &nbsp;    \<gmd:linkage> <br />
>   &nbsp; &nbsp;  \<gmd:URL> http://www.ngdc.noaa.gov/dem/squareCellGrid/download/258 </gmd:URL> <br />
>    &nbsp;   </gmd:linkage> <br />
>     &nbsp; \<gmd:name> <br />
>      &nbsp; &nbsp; \<gco:CharacterString> Adak, AK 1 arc-second Tsunami Inundation DEM </gco:CharacterString> <br />
>     &nbsp;  \</gmd:name> <br />
>     &nbsp; \<gmd:description> <br />
>     &nbsp; &nbsp;  \<gco:CharacterString> Download page for accessing DEM, metadata record and development report. </gco:CharacterString> <br />
>     &nbsp; \</gmd:description> <br />
>     &nbsp; \<gmd:function> <br />
>     &nbsp; &nbsp;  \<gmd:CI_OnLineFunctionCode codeList="http://www.ngdc.noaa.gov/metadata/published/xsd/schema/resources/Codelist/gmxCodelists.xml#CI_OnLineFunctionCode" codeListValue="download"> <br />
>        &nbsp; &nbsp; &nbsp; download <br />
>      &nbsp; &nbsp; \</gmd:CI_OnLineFunctionCode><br />
>    &nbsp;   \</gmd:function><br />
>     \</gmd:CI_OnlineResource>




