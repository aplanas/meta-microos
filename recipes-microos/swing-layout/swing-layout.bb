SUMMARY = "Natural layout for Swing panels"
DESCRIPTION = "Swing Layout Extensions goal is to make it easy to create \
   professional cross platform layouts with Swing. This project has \
   an eye towards the needs of GUI builders, such as NetBeans. This \
   project consists of the following pieces: * Ability to get the \
   baseline for components. \
 \
* Ability to get the preferred gap between components. \
 \
A new LayoutManager that utilizes both of these concepts and is tuned \
toward a free-form drag and drop layout model as can be provided by GUI \
builders."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "swing-layout-1.0.3-37.6.noarch.rpm"
RPM_HASH = "d12ae55046974fe9649e21bb43744c0199e7a80a995bf39f705fdc2b594dc719b993c402cf9e4ab0455a21e24b8458ff432c3c8e7ad8e1c51d46483cf68afd11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swing-layout"
RDEPENDS:${PN} += "java"

inherit rpm
