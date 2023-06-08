SUMMARY = "PDF Generator Using HTML and CSS"
DESCRIPTION = "xhtml2pdf is a html2pdf converter using the ReportLab Toolkit, the HTML5lib and \
pyPdf. It supports HTML 5 and CSS 2.1 (and some of CSS 3). It is completely \
written in pure Python so it is platform independent. \
 \
The main benefit of this tool that a user with Web skills like HTML and CSS is \
able to generate PDF templates very quickly without learning new technologies."
LICENSE = "Apache-2.0"

PV = "0.2.6"

RPM_NAME = "python311-xhtml2pdf-0.2.6-1.4.noarch.rpm"
RPM_HASH = "43bcf57b1b739cd7373b1bce930ea915a22acbb3b0d5e9df50b6f73289a9fb907c71bf8fc5a32dc9efc8ab5c68fe8527bb4faa71e0c55ef60dcd47c7b30ba444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xhtml2pdf) python311-xhtml2pdf python3dist(xhtml2pdf)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Pillow python311-PyPDF3 python311-arabic-reshaper python311-html5lib python311-python-bidi python311-reportlab python311-setuptools update-alternatives"

inherit rpm
