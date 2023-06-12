SUMMARY = "News Feed extension for Sphinx"
DESCRIPTION = "sphinxcontrib-newsfeed is a extension for adding a simple Blog, News or Announcements section to a Sphinx website. \
 \
Features: \
 * Makes feed entries from Sphinx documents. \
 * Generates a list of entries with teasers. \
 * Saves the feed to a file in RSS format. \
 * Supports comments via Disqus."
LICENSE = "BSD-2-Clause"

PV = "0.1.4"

RPM_NAME = "python311-sphinxcontrib-newsfeed-0.1.4-4.15.noarch.rpm"
RPM_HASH = "7f6e605998486fdacb2aa812aadf53faa983473bd09af6db817f1c81041b6761a0a9586aa163dcf435d2e0a13a381afd91f1ed8abeb2a21b2598073546263fe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-newsfeed) \
python311-sphinxcontrib-newsfeed \
python3dist(sphinxcontrib-newsfeed)"
RDEPENDS:${PN} += "python(abi) \
python311-Sphinx"

inherit rpm
