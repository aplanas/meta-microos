SUMMARY = "Least-Squares Minimization with Bounds and Constraints"
DESCRIPTION = "A library for least-squares minimization and data fitting in \
Python.  Built on top of scipy.optimize, lmfit provides a Parameter object \
which can be set as fixed or free, can have upper and/or lower bounds, or \
can be written in terms of algebraic constraints of other Parameters.  The \
user writes a function to be minimized as a function of these Parameters, \
and the scipy.optimize methods are used to find the optimal values for the \
Parameters.  The Levenberg-Marquardt (leastsq) is the default minimization \
algorithm, and provides estimated standard errors and correlations between \
varied Parameters.  Other minimization methods, including Nelder-Mead's \
downhill simplex, Powell's method, BFGS, Sequential Least Squares, and \
others are also supported.  Bounds and constraints can be placed on \
Parameters for all of these methods. \
 \
In addition, methods for explicitly calculating confidence intervals are \
provided for exploring minmization problems where the approximation of \
estimating Parameter uncertainties from the covariance matrix is \
questionable."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.1.0"

RPM_NAME = "python39-lmfit-1.1.0-1.3.noarch.rpm"
RPM_HASH = "6f3fa480755ae18a52bbe67e4aeb882c3a4df7823d61e339e63794b7843179d8f5f2e95646aed2b5b5a580d20b1006b018327d47f34e3965aaa97ad52ef388e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lmfit) \
python39-lmfit \
python3dist(lmfit)"
RDEPENDS:${PN} += "python(abi) \
python39-asteval \
python39-numpy \
python39-scipy \
python39-uncertainties"

inherit rpm
