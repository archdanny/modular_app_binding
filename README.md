# Modular App binding epoxy

Sample project for resource not found error in generated epoxy models in multi modular android app. 

The EpoxyDataBindingPattern is used to generate models for the layouts begining with cell.

The cell_feature_one.xml layout in the feature_one module uses the resource @dimen/cell_height from de app module.

A symbol not found error is thrown in the generated class.
'error: cannot find symbol variable cell_height'

