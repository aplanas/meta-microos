SUMMARY = "C++ stdlib man pages"
DESCRIPTION = "stdman is a tool that parses archived HTML files from cppreference and \
generates groff-formatted manual pages for Unix-based systems. The goal is to \
provide excellent formatting for easy readability. \
 \
This package provides the full cppreference documentation in the man format."
LICENSE = "MIT"

PV = "2022.07.30"

RPM_NAME = "stdman-2022.07.30-1.2.noarch.rpm"
RPM_HASH = "103024e424490b3dc0e855903721f744aa23dc5b0210ad3fc3c3b222f6f95e55490a9893851c450bbec217b700ebfeb3f4f44b3c304bf3c9f715d6a6fdf991f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stdman"
RDEPENDS:${PN} += "man"

inherit rpm
