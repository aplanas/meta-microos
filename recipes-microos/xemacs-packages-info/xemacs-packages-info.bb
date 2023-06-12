SUMMARY = "Info Files for the XEmacs Packages"
DESCRIPTION = "This package contains all the info files for the extra packages for \
XEmacs. All these files can be read online with XEmacs and describe \
XEmacs and some of its modes. \
 \
 \
 \
Authors: \
-------- \
    Chuck Thompson   <cthomp@cs.uiuc.edu> \
    Ben Wing <wing@666.com> \
    and many other contributors"
LICENSE = "GPL-3.0-or-later"

PV = "20130822"

RPM_NAME = "xemacs-packages-info-20130822-12.6.noarch.rpm"
RPM_HASH = "ca9a654775b773a042bbceec78b086c87b00f31c21815a6ad923cc8ba9dbd03e1db60322e16a2eb7f39f768d33594ab9cc853d35f146d86eadda298bbc4a0f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-info:/usr/share/xemacs/xemacs-packages/info/auctex.info.gz \
xemacs-packages-info"
RDEPENDS:${PN} += ""

inherit rpm
