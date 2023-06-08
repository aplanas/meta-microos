SUMMARY = "Static gallery generator"
DESCRIPTION = "Sigal is a static gallery generator written in Python with the following \
features: \
 \
* Generates HTML pages using jinja2 templates. \
* Emits relative links for a portable output. \
* Supports themes, videos, EXIF tags, and ZIP downloading. \
* Processes directories recursively and files in parallel. \
 \
The idea behind Sigal is to ease the use of the JavaScript libraries like \
galleria_. These libraries display the images, Sigal on the other hand does \
image resizing, thumbnail creation and HTML page generation."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "python311-sigal-2.3-1.7.noarch.rpm"
RPM_HASH = "a03749bb7ce2768f720ba7728c356a8e4e97644f7426450a7ec50e7ee9419a0d768911ac04d4bd366437e24a056699429fc9ed92f850e9c72bbb37e99627cd62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sigal) python311-sigal python3dist(sigal)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Jinja2 python311-Markdown python311-Pillow python311-blinker python311-click python311-natsort python311-pilkit update-alternatives"

inherit rpm
