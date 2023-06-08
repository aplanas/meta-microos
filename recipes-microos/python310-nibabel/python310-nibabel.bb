SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python310-nibabel-4.0.2-1.4.noarch.rpm"
RPM_HASH = "c81cee403b5f22418383eb61925a630e5c6bbf799e8aa1141340cd728325529fcad8c5854ff6f1e02d09c097e57f2f5a0ec6a537d94faff0aaaf68bb2355c8f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nibabel python3.10dist(nibabel) python310-nibabel python3dist(nibabel)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-numpy update-alternatives"

inherit rpm
