SUMMARY = "Tool to parametrize and run Jupyter and nteract Notebooks"
DESCRIPTION = "Papermill is a tool for parameterizing, executing, \
and analyzing Jupyter Notebooks."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python39-papermill-2.4.0-2.1.noarch.rpm"
RPM_HASH = "6b4775da004d8ba3bf3fbc87447237b5d6e22eec8da84c2c7d2cd67746c0e21d8b639f9a74c162a175610ba46baa7bd2053f0d85525ad7c53ff84129f233c8e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(papermill) \
python39-papermill \
python3dist(papermill)"
RDEPENDS:${PN} += "(python39-typing_extensions if python39-azure-storage-blob) \
/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-ansiwrap \
python39-click \
python39-entrypoints \
python39-nbclient \
python39-nbformat \
python39-requests \
python39-tenacity \
python39-tqdm \
update-alternatives"

inherit rpm
