SUMMARY = "The Java Indexed Serialization Package"
DESCRIPTION = "Jisp uses B-Tree and hash indexes for keyed access to variable-length \
serialized objects stored in files."
LICENSE = "Libpng"

PV = "2.5.1"

RPM_NAME = "jisp2-2.5.1-28.5.noarch.rpm"
RPM_HASH = "9f6d978edba373573645a9788da027348d3834dd7c03cb8916b1c3519af75f56311f0d06c407724185325984469e2252a7d38c81ba5c45e07a12fa2e33bb4a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hibernate_in_process_cache jisp2"
RDEPENDS:${PN} += "/bin/sh javapackages-tools update-alternatives"

inherit rpm
