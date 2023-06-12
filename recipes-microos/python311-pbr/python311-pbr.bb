SUMMARY = "Python Build Reasonableness"
DESCRIPTION = "PBR is a library to automatically do a bunch of standard \
things you want in your setup.py without you having to repeat \
them every time. It will set versions, process requirements \
files and generate AUTHORS and ChangeLog file all from git \
information."
LICENSE = "Apache-2.0"

PV = "5.11.1"

RPM_NAME = "python311-pbr-5.11.1-4.1.noarch.rpm"
RPM_HASH = "2832e25858d040cf4630d5fe5870e8f9990a05d2b6ce6cf4a6937c3f949e41d930b95b6f78205e209b16dffcab2358fe37cbc4259f0af0f49961fa79416078a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pbr) \
python311-pbr \
python3dist(pbr)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
