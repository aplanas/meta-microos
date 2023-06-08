SUMMARY = "Abstraction over xpyb"
DESCRIPTION = "xpybutil is an abstraction over the X Python Binding (xpyb). It exists because xpyb is a very low level library that communicates with X."
LICENSE = "WTFPL"

PV = "0.0.6"

RPM_NAME = "python310-xpybutil-0.0.6-1.14.noarch.rpm"
RPM_HASH = "2f5bcea16b124ab404eabffeca88986848cc8551a3dac34a9cf6832cbd7e0f422b7f52df8fd6cb6db43a068e79563f1114005f2972dd1e52c33e27e641f18c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xpybutil python3.10dist(xpybutil) python310-xpybutil python3dist(xpybutil)"
RDEPENDS:${PN} += "python(abi) python310-xcffib"

inherit rpm
