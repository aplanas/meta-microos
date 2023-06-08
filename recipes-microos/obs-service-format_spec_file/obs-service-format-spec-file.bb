SUMMARY = "An OBS source service: reformats a spec file to SUSE standard"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This source service is formating the spec file to SUSE standard. The rational \
behind is to make it easier to review spec files from unknown packagers. \
 \
This should be used in 'trylocal' mode, so that osc is adapting the existing \
spec file instead of creating a new one."
LICENSE = "GPL-2.0-only"

PV = "20221113"

RPM_NAME = "obs-service-format_spec_file-20221113-1.2.noarch.rpm"
RPM_HASH = "5d2f175f8898640c2ea7c83d31cf0571e4557cd545e80d0050534d6d27b4cecc8ba87a047e61b59ba1e74d29efff7e00db2865a67e3041cb476df51a02625b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-format_spec_file"
RDEPENDS:${PN} += "/bin/bash /usr/bin/perl obs-service-source_validator"

inherit rpm
