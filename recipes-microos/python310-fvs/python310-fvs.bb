SUMMARY = "File Versioning System with hash comparison"
DESCRIPTION = "File Versioning System with hash comparison and data storage to \
create unlinked states that can be deleted \
 \
The main reason for this project is for the purpose of personal \
knowledge and understanding of the versioning system. The second \
reason is to make a simple and easy-to-implement versioning \
system for Bottles. \
 \
There are plenty of other versioning systems out there, but all \
of these provide features that I wouldn't need in my projects. \
The purpose of FVS is to always remain as clear and simple as \
possible, providing only the functionality of organizing file \
versions into states, ie recovery points that take advantage of \
deduplication to minimize space consumption"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-fvs-0.3.4-1.3.noarch.rpm"
RPM_HASH = "62db48c8cbaf71c267de98288ed83e3f916679d1e99c351bc5b0f7fd5df3d1b13898b347e06bfe7ae12422c33cf9b3d42115602e45e176df5ff524a31d383049"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fvs python3.10dist(fvs) python310-fvs python3dist(fvs)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-orjson update-alternatives"

inherit rpm
