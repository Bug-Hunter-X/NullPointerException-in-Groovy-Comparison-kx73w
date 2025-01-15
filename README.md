# Groovy NullPointerException in Comparison

This example demonstrates a common issue in Groovy related to null comparisons.  Groovy's dynamic typing can mask potential `NullPointerExceptions` if not handled carefully.

The `myMethod` function compares two numbers and returns the larger. However, if either input is `null`, a `NullPointerException` occurs during the comparison.

The provided solution shows how to safely handle null inputs using Groovy's optional safe navigation operator.
