SUMMARY = "Tool for making eBooks from stories on fanfiction and other web sites"
DESCRIPTION = "FanFicFare is a tool for downloading fanfiction and original stories from various sites into ebook form. \
 \
FanFicFare is the rename and move of the FanFictionDownLoader (AKA FFDL, AKA fanficdownloader) project. \
 \
Main Features of FanFicFare: \
    - Download fanfiction stories from various sites into ebooks. \
    - Create various ebook formats (currently epub, mobi, HTML, txt) \
    - Also available as a Calibre plugin (not in this package) \
    - Ability to update already downloaded book"
LICENSE = "GPL-3.0-only"

PV = "4.21.0"

RPM_NAME = "python311-fanficfare-4.21.0-2.2.noarch.rpm"
RPM_HASH = "55b457bd5610c3564e4a7edac62bc99261713d5410550f5205348e2d2c885c8098becb8cac2c150f3b06ce3544a957c0977aeee3f0c1a091f71e78b1b84c5325"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fanficfare) \
python311-fanficfare \
python3dist(fanficfare)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-beautifulsoup4 \
python311-chardet \
python311-cloudscraper \
python311-html2text \
python311-html5lib \
python311-requests-file \
python311-setuptools \
update-alternatives"

inherit rpm
