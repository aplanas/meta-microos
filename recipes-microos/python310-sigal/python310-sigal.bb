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

RPM_NAME = "python310-sigal-2.3-1.7.noarch.rpm"
RPM_HASH = "7443ad06e0c4c294638929dbfa5f0abf1968f086645563b5ee9f9a15a5e132cfaec58610c8e06a3e4434163f8b163472a79225da5c9cf0518a9df0fc0c918235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sigal \
python3.10dist(sigal) \
python310-sigal \
python3dist(sigal)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Jinja2 \
python310-Markdown \
python310-Pillow \
python310-blinker \
python310-click \
python310-natsort \
python310-pilkit \
update-alternatives"

inherit rpm
