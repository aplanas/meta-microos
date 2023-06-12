SUMMARY = "OfficeBean Java Bean component for LibreOffice"
DESCRIPTION = "With the OfficeBean, a developer can easily write Java applications, \
harnessing the power of LibreOffice. It encapsulates a connection to \
a locally running LibreOffice process, and hides the complexity of \
establishing and maintaining that connection from the developer. \
 \
It also allows embedding of LibreOffice documents within the Java \
environment. It provides an interface the developer can use to obtain \
Java AWT windows into which the backend LibreOffice process draws \
its visual representation. These windows are then plugged into the UI \
hierarchy of the hosting Java application. The embedded document is \
controlled from the Java environment, since the OfficeBean allows \
developers to access the complete LibreOffice API from their Java \
environment giving them full control over the embedded document, its \
appearance and behavior."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-officebean-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "613b3d18a7b3e12ed8d03eaa69089806ae291558be96fc79e6e5999bf5fa81bcac775dbd9be2918aeedf78a2d9c775a02881970f1cd0c8d0eb63897f250219a2"

RPROVIDES:${PN} += "libofficebean.so()(64bit) \
libreoffice-officebean \
libreoffice-officebean(aarch-64)"
RDEPENDS:${PN} += "jre-64 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libjawt.so()(64bit) \
libreoffice \
rtld(GNU_HASH)"

inherit rpm
