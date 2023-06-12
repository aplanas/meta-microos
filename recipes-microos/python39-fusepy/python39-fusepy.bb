SUMMARY = "A python module that provides a simple interface to FUSE"
DESCRIPTION = "fusepy is a Python module that provides a simple interface to FUSE. It makes \
the implementation of userspace file systems based on FUSE and python \
possible."
LICENSE = "ISC"

PV = "3.0.1"

RPM_NAME = "python39-fusepy-3.0.1-2.14.noarch.rpm"
RPM_HASH = "82c05978a2f7261bf5dba6b73987fa0bd329b9d461af82968540629f5273fab6644f266a939a63ce23f64ff476f0c1863f3ae1aedf65019dd4f2f3c515ea0aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fusepy) \
python39-fusepy \
python3dist(fusepy)"
RDEPENDS:${PN} += "libfuse2 \
python(abi)"

inherit rpm
