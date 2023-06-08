SUMMARY = "Data files for Zlibrary"
DESCRIPTION = "This package contains data files for Zlibrary."
LICENSE = "GPL-2.0+"

PV = "0.99.4"

RPM_NAME = "zlibrary-data-0.99.4-3.27.noarch.rpm"
RPM_HASH = "7f8ad083ce7b4dafa2fada4adbfab81faf066faa8117af1cc507029df6f5ca3a7e3fe01024cb07d134707f2778bcc475a9f9a1959692fa203e5611c8339077c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zlibrary-data"
RDEPENDS:${PN} += ""

inherit rpm
