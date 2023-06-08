SUMMARY = "Additional Import and Export Filters for LibreOffice"
DESCRIPTION = "This package includes some additional import and export filters for \
LibreOffice: \
- AportisDoc (Palm) \
- Pocket Excel \
- Pocket Word \
- DocBook \
- XHTML"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-filters-optional-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "d5a918f3860fe710d5408865cff368babe90452e5b1e246f3ee5856c0e80499f1260e7126e48b7e7e6c7f6b828e41ad4c23e8ba78af36aaba29f6d8ad75b452c"

RPROVIDES:${PN} += "application() application(libreoffice-xsltfilter.desktop) libreoffice-filters-optional libreoffice-filters-optional(aarch-64) mimehandler(application/vnd.oasis.opendocument.graphics-flat-xml) mimehandler(application/vnd.oasis.opendocument.presentation-flat-xml) mimehandler(application/vnd.oasis.opendocument.spreadsheet-flat-xml) mimehandler(application/vnd.oasis.opendocument.text-flat-xml)"
RDEPENDS:${PN} += "libreoffice-calc libreoffice-draw libreoffice-impress libreoffice-math libreoffice-writer"

inherit rpm
