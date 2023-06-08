SUMMARY = "PDF Processing Tools"
DESCRIPTION = "SetPDFMetadata updates the metadata of a PDF file. In particular, \
it can be used to add outlines (bookmarks) to a document. \
Furthermore, it can set the document properties (e.g. author, \
title, keywords, creator, producer).  PDFEmbedFonts embeds all \
referenced fonts into a PDF file. Optionally, it can also linearize \
the PDF file for online publication ('fast web view', 'optimized'). \
 \
This package contains tools for PDF file processing."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.0"

RPM_NAME = "netperfmeter-pdfproctools-1.9.0-1.9.noarch.rpm"
RPM_HASH = "39ecd2b4302e083663970bff06152317672081e2695239452da1c8091200fa86808063a788dbe1508ad2275be3d14521a3ebb85ffe655bce3da573a905acffc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netperfmeter-pdfproctools"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl ghostscript perl perl-PDF-API2 qpdf"

inherit rpm
