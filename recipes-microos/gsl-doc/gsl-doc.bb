SUMMARY = "Documentation for the GNU Scientific Library"
DESCRIPTION = "This package contains documentation for GSL \
 \
The GNU Scientific Library (GSL) is a collection of routines for \
numerical computing. The routines are written from scratch by the GSL \
team in ANSI C, and present an Applications Programming Interface \
(API) for C programmers, while allowing wrappers to be written for very \
high level languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "gsl-doc-2.7.1-1.3.noarch.rpm"
RPM_HASH = "8f4b19459052e2cad52a4bb3c900e2981a28d48fb2df347627477c6162a73a4913c34bb6802cb518467815fcec0aa258e1973d32ab9d38f66af621d99d9377c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsl-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
