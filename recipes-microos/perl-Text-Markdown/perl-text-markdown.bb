SUMMARY = "Convert Markdown syntax to (X)HTML"
DESCRIPTION = "Markdown is a text-to-HTML filter; it translates an easy-to-read / \
easy-to-write structured text format into HTML. Markdown's text format is \
most similar to that of plain text email, and supports features such as \
headers, *emphasis*, code blocks, blockquotes, and links. \
 \
Markdown's syntax is designed not as a generic markup language, but \
specifically to serve as a front-end to (X)HTML. You can use span-level \
HTML tags anywhere in a Markdown document, and you can use block level HTML \
tags (like <div> and <table> as well)."
LICENSE = "BSD-3-Clause"

PV = "1.000031"

RPM_NAME = "perl-Text-Markdown-1.000031-17.2.noarch.rpm"
RPM_HASH = "dfb61ddefd99dbf23b0376aeb8d98710df3cf439062856b64c1d191cebeb90c66caab1b183c969a3c9860767f4c5141c900f0ecd030f9fdcf8920e830d8ac9f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::Markdown) \
perl-Text-Markdown"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
perl(:MODULE_COMPAT_5.36.0) \
update-alternatives"

inherit rpm
