SUMMARY = "EpubMerge Calibre Plugin"
DESCRIPTION = "This plugin provides the ability to create new EPUBs by combining the contents \
of existing (non-DRM) EPUB format eBooks. \
 \
Main Features of EpubMerge Plugin: \
    - Select a list of stories in calibre, \
    - Order them, \
    - Edit the metadata for the new combined eBook, and then, \
    - Merge the contents of the EPUBs together into the new eBook, now \
      including cover from metadata if set. \
    - UnMerge previously merged epubs if metadata was saved during merge. \
    - Configurably able to save the metadata for each merged book for UnMerging \
      later if desired. (Defaults to On.) \
    - Configurably able to populate custom columns from source books. \
    - Options now stored inside the Library rather than an external JSON file. \
    - CLI \
 \
There are a few configurable options: whether or not to insert a Table of \
Contents entry for each merged book (with it's original TOC nested underneath \
it), an option to flatten the TOC down to one level only, and including the \
merged books comments. These options are stored by Library."
LICENSE = "GPL-3.0-only"

PV = "2.15.0"

RPM_NAME = "python311-epubmerge-2.15.0-1.4.noarch.rpm"
RPM_HASH = "c8d3e9fb7a305101e41dda40bf57624d39ba2f0c45758adc53f747ced4e1ffbdd27cb63313cd332568a9fde034cc4a44f41ff80ddceec8ad838e9fce90862d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(epubmerge) python311-epubmerge python3dist(epubmerge)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-setuptools update-alternatives"

inherit rpm
