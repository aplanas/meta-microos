SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python39-nibabel-4.0.2-1.4.noarch.rpm"
RPM_HASH = "c6ad95decff97b293927d56db2cdf583cbaa8ba7157486c3177fb6b5a72df7e2031e398740b380f8266d45236ddc865f32258d3d09aa9f6502681ef07e2e44b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(nibabel) python39-nibabel python3dist(nibabel)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-numpy update-alternatives"

inherit rpm
