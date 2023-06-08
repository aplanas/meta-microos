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

PV = "1.6.3"

RPM_NAME = "python311-releases-1.6.3-5.1.noarch.rpm"
RPM_HASH = "37a76e3661dd97701e7d948ffc561e76eb08e812fcb2137ed8fc2199505b7e441bc9ac8784f8dd109f3d070f77620948b4d6ce15174506d423196671cf406ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(releases) python311-releases python3dist(releases)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx python311-semantic_version python311-six"

inherit rpm
