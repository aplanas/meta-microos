SUMMARY = "A Python bindings generator for C/C++ libraries"
DESCRIPTION = "SIP is a collection of tools that makes it very easy to create Python \
bindings for C and C++ libraries. It was originally developed in 1998 \
to create PyQt, the Python bindings for the Qt toolkit, but can be used \
to create bindings for any C or C++ library. For example it is also used \
to generate wxPython, the Python bindings for wxWidgets. \
 \
This package contains all the developer tools you need to create your \
own sip bindings in the currently default version. Look for \
python310-sip<N>-devel, if you need to build a package with a \
specific version of SIP v<N>."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.7.9"

RPM_NAME = "python310-sip-devel-6.7.9-4.5.noarch.rpm"
RPM_HASH = "c2000ca451812d8c95eb02d7d23b6807a9928ac019aabc1e26f4b7d6d91c6cd371427cfad835bdab9d7dfd35c19a14cab7fce68eb7b7d8f79fbadbb1eca56ee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sip-devel \
python310-sip-devel"
RDEPENDS:${PN} += "python310-sip6-devel"

inherit rpm
