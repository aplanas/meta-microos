SUMMARY = "Microsoft Azure Storage File Client Library for Python"
DESCRIPTION = "This project provides a client library in Python that makes it easy to \
consume Microsoft Azure Storage services. For documentation please see \
the Microsoft Azure `Python Developer Center`_ and our `API Reference`_ \
Page."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python311-azure-storage-file-2.1.0-2.15.noarch.rpm"
RPM_HASH = "4011157fc9366a59f9f7c4a870be39225101785ca4255885229ba81f61d1f344061329228b3504733798b1a45dd60bd81959698aae5f5b6d9ef8152855319732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-storage-file) \
python311-azure-storage-file \
python3dist(azure-storage-file)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-nspkg \
python311-azure-storage-common \
python311-azure-storage-nspkg"

inherit rpm
