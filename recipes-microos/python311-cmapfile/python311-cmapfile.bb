SUMMARY = "Write Chimera Map (CMAP) files"
DESCRIPTION = "Create Chimera MAP files from various file formats containing volume data."
LICENSE = "BSD-3-Clause"

PV = "2022.9.29"

RPM_NAME = "python311-cmapfile-2022.9.29-1.4.noarch.rpm"
RPM_HASH = "8a407d1c6e01b544a53e331d5286994ba29c79554d5464fad17b5b84191cf0334959e1709c1aa47b8b886b86ad16f5fb3fc472404bd18037f4aad0f09d559b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cmapfile) python311-cmapfile python3dist(cmapfile)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-h5py python311-numpy python311-oiffile python311-scipy python311-tifffile update-alternatives"

inherit rpm
