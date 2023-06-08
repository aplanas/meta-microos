SUMMARY = "Ctypes-based simple MagickWand API binding for Python"
DESCRIPTION = "Ctypes-based simple MagickWand API binding for Python."
LICENSE = "MIT"

PV = "0.6.11"

RPM_NAME = "python311-Wand-0.6.11-1.3.noarch.rpm"
RPM_HASH = "a87abb6253fd53c7e53c02aebb6a82fd7a939743caa9606314384fcb41b56765fdc068ddbb89b2859d9efe2fdf0694741c332d91e46f095a35f69c653a9fd096"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wand) python311-Wand python3dist(wand)"
RDEPENDS:${PN} += "ImageMagick python(abi)"

inherit rpm
