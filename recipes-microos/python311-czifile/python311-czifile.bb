SUMMARY = "Read Carl Zeiss(r) Image (CZI) files"
DESCRIPTION = "Read image and metadata from Carl Zeiss(r) ZISRAW (CZI) microscopy files."
LICENSE = "BSD-3-Clause"

PV = "2019.7.2"

RPM_NAME = "python311-czifile-2019.7.2-2.9.noarch.rpm"
RPM_HASH = "8cc46f871b090b35a534f812904e01ad76337d962122a52791242bed04352b5fef236bb0f66e68f18947e6b8a60d02f2aa1944b9c89a217230c2ed43ebb4500d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(czifile) \
python311-czifile \
python3dist(czifile)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-imagecodecs \
python311-numpy \
python311-scipy \
python311-tifffile \
update-alternatives"

inherit rpm
