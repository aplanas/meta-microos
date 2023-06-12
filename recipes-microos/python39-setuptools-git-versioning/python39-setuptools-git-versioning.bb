SUMMARY = "Use git repo data for building a version number according PEP-440"
DESCRIPTION = "Use git repo data (latest tag, current commit hash, etc) for building a \
version number according PEP440. \
 \
  - Can be installed & configured through both `setup.py` and :PEP518's `pyproject.toml` \
  - Does not require to change source code of the project \
  - Tag-, file-, and callback-based versioning schemas are supported \
  - Templates for *tag*, *dev* and *dirty* versions are separated \
  - Templates support a lot of substitutions including git and environment information"
LICENSE = "MIT"

PV = "1.13.2"

RPM_NAME = "python39-setuptools-git-versioning-1.13.2-2.2.noarch.rpm"
RPM_HASH = "e9939d3d0adf68cf8a9b709512f0879754dcc340a6d726c6dbf6d058519bcd2887fea63ab923d119519d60b2b13ff37a50b2ff01c520abd2a783910f9df06517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(setuptools-git-versioning) \
python39-setuptools-git-versioning \
python39-setuptools_git_versioning \
python3dist(setuptools-git-versioning)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
git-core \
python(abi) \
python39-Deprecated \
python39-packaging \
python39-setuptools \
python39-toml \
update-alternatives"

inherit rpm
