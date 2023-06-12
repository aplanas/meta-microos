SUMMARY = "PDF Generator Using HTML and CSS"
DESCRIPTION = "xhtml2pdf is a html2pdf converter using the ReportLab Toolkit, the HTML5lib and \
pyPdf. It supports HTML 5 and CSS 2.1 (and some of CSS 3). It is completely \
written in pure Python so it is platform independent. \
 \
The main benefit of this tool that a user with Web skills like HTML and CSS is \
able to generate PDF templates very quickly without learning new technologies."
LICENSE = "Apache-2.0"

PV = "0.2.6"

RPM_NAME = "python310-xhtml2pdf-0.2.6-1.4.noarch.rpm"
RPM_HASH = "e9f3003138ee09019cd11a1a89e0d152474c23fc7a7fedc948d093151620821d16bf37eae43d7bfb3d10c327b8fc18d208a67934745b6a37229dbd69f609e9fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xhtml2pdf \
python3.10dist(xhtml2pdf) \
python310-xhtml2pdf \
python3dist(xhtml2pdf)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Pillow \
python310-PyPDF3 \
python310-arabic-reshaper \
python310-html5lib \
python310-python-bidi \
python310-reportlab \
python310-setuptools \
update-alternatives"

inherit rpm
