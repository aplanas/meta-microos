SUMMARY = "AngularJS library 'tv4' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "SUSE-Public-Domain"

PV = "1.2.7.0"

RPM_NAME = "python311-XStatic-tv4-1.2.7.0-1.15.noarch.rpm"
RPM_HASH = "0f524b9d994e70ecaf91843f3aac560c24513d5f28152d5235aad6bea543498d89e9b037c1a68a3c752000c7d21cd1f84fff3a118a8dd42bd3698844839dd284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xstatic-tv4) python311-XStatic-tv4 python3dist(xstatic-tv4)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
