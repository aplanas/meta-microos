SUMMARY = "A Sphinx extension for changelog manipulation"
DESCRIPTION = "Releases is a Python 2+3 compatible `Sphinx <http://sphinx-doc.org>`_ extension \
designed to help you keep a source control friendly, merge friendly changelog \
file & turn it into useful, human readable HTML output. \
 \
Specifically: \
 \
* The source format (kept in your Sphinx tree as ``changelog.rst``) is a \
  stream-like timeline that plays well with source control & only requires one \
  entry per change (even for changes that exist in multiple release lines). \
* The output (when you have the extension installed and run your Sphinx build \
  command) is a traditional looking changelog page with a section for every \
  release; multi-release issues are copied automatically into each release. \
* By default, feature and support issues are only displayed under feature \
  releases, and bugs are only displayed under bugfix releases. This can be \
  overridden on a per-issue basis."
LICENSE = "BSD-2-Clause"

PV = "2.1.1"

RPM_NAME = "python311-releases-2.1.1-1.1.noarch.rpm"
RPM_HASH = "c645b3d1d5926678a109303d9769247ac917bdb04d3ca30c0da386d5f9655f0e7f8275ba832a9c433431b0b20f64bdcc0de500e9d4ed8b951e3ba152ecf0fe7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(releases) \
python311-releases \
python3dist(releases)"
RDEPENDS:${PN} += "python(abi) \
python311-Sphinx \
python311-semantic_version"

inherit rpm
