SUMMARY = "Python library to query Google Scholar"
DESCRIPTION = "This package provides a python package and CLI to query google scholar \
and get references in various formats (e.g. bibtex, endnote, etc.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python310-gscholar-2.1.0-1.4.noarch.rpm"
RPM_HASH = "9a57bced1ec6a8fd106d6daa3ee6d00b89b207b10916fb34ef2b886c7ae4f8407c3cd4628fea24d01f48be07954b32bbde3ed8cfec0fd69703fff80ee12bc941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gscholar \
python3.10dist(gscholar) \
python310-gscholar \
python3dist(gscholar)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
