SUMMARY = "An OBS source service: reformats a spec file to SUSE standard"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
This source service is formating the spec file to SUSE standard. The rational \
behind is to make it easier to review spec files from unknown packagers. \
 \
This should be used in 'trylocal' mode, so that osc is adapting the existing \
spec file instead of creating a new one."
LICENSE = "GPL-2.0-only"

PV = "20230522"

RPM_NAME = "obs-service-format_spec_file-20230522-1.1.noarch.rpm"
RPM_HASH = "a1822e9e3978dedf14fe9b91e6d05ff4cd4da89f7f5245a1aaf258e11edffa7a5469684bc70b287c836307a9aba5943c9ab1ba6d1bff977d8edd32076b0aeed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-format_spec_file"
RDEPENDS:${PN} += "/bin/bash /usr/bin/perl obs-service-source_validator"

inherit rpm
