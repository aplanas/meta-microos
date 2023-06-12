SUMMARY = "Python library to query Google Scholar"
DESCRIPTION = "This package provides a python package and CLI to query google scholar \
and get references in various formats (e.g. bibtex, endnote, etc.)"
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-gscholar-2.1.0-1.4.noarch.rpm"
RPM_HASH = "03446699d28359d56dc5b537d23ffc1e0862edf1ab3ec1bdc09166854b36a64c40def895e86ceb1c4129ddc00ee61b4dc12cb4e8e796c992049a78e139aed660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gscholar) \
python39-gscholar \
python3dist(gscholar)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
