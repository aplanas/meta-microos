SUMMARY = "LibreOffice Writer Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Writer: \
 \
- MediaWiki Publisher"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-writer-extensions-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "e261bbd32310f7fcc5218f5375b85a601f5cc3d9405190c62f707afde76ecea97631dfee41521d77812ea3b3844632a23de655d30500c66064fe4d1769a9dad0"

RPROVIDES:${PN} += "libreoffice-writer-extensions libreoffice-writer-extensions(aarch-64)"
RDEPENDS:${PN} += "jre-64 libreoffice libreoffice-writer"

inherit rpm
