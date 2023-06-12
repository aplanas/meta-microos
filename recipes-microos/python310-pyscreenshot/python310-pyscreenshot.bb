SUMMARY = "Python screenshots"
DESCRIPTION = "The pyscreenshot module can be used to copy the contents of the screen \
to a Pillow image memory using various back-ends. \
Replacement for the ImageGrab Module."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python310-pyscreenshot-3.0-2.3.noarch.rpm"
RPM_HASH = "a362a2758842f924d4b40302cdfac8f8ce546d87fce24403c78465f4db6e060caaba2f878c7b50288ed45a003fc2e612872f5a61129a3a2d1ce883955f98e571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyscreenshot \
python3.10dist(pyscreenshot) \
python310-pyscreenshot \
python3dist(pyscreenshot)"
RDEPENDS:${PN} += "python(abi) \
python310-EasyProcess \
python310-entrypoint2 \
python310-jeepney \
python310-mss \
xorg-x11-server-extra"

inherit rpm
