SUMMARY = "Python toolkit for creating graphical user interfaces"
DESCRIPTION = "Flexx is a pure Python toolkit for creating graphical user interfaces \
(GUIs), that uses web technology for its rendering. Apps are written \
purely in Python; Flexx's transpiler generates the necessary JavaScript \
on the fly. \
 \
Flexx can be used to create (cross platform) desktop applications, web \
applications, and (if designed well) export an app to a standalone HTML \
document. It also works in the Jupyter notebook."
LICENSE = "BSD-2-Clause"

PV = "0.8.4"

RPM_NAME = "python311-flexx-0.8.4-1.5.noarch.rpm"
RPM_HASH = "177959472acb84c42528033bb8e13ae17bf792e0444169cd800c578ed72a37290ba8661d618fb9876c73afc1cf4f57b079210058af28eaeb1f95cb2d3c05320f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flexx) python311-flexx python3dist(flexx)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-dialite python311-pscript python311-tornado python311-webruntime update-alternatives"

inherit rpm
