SUMMARY = "Python screenshots"
DESCRIPTION = "The pyscreenshot module can be used to copy the contents of the screen \
to a Pillow image memory using various back-ends. \
Replacement for the ImageGrab Module."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python39-pyscreenshot-3.0-2.3.noarch.rpm"
RPM_HASH = "a655f38ba1d306892ff83c4374dd3e8ad90b71d05cfc93b69ff986cdfad6f7fc3eb8bdb153538e1ab0bad4b5781a9b7f9d6f6bc369cd436de11f828b5b982a28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyscreenshot) \
python39-pyscreenshot \
python3dist(pyscreenshot)"
RDEPENDS:${PN} += "python(abi) \
python39-EasyProcess \
python39-entrypoint2 \
python39-jeepney \
python39-mss \
xorg-x11-server-extra"

inherit rpm
